package fr.nathan.demos.tp1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }


    @GetMapping
    public Temperature getTemperature(@RequestParam (defaultValue = "0")double celsius) {
        return temperatureService.getTemperatures(celsius);
    }
   @PostMapping("/convert")
   public Temperature convertTemperature(@RequestBody TemperatureConvertDto convert){
        return temperatureService.getTemperatures(convert.getUnit,
                convert.getValue)
   }
}
