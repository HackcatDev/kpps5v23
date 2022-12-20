package com.example.vectorcompute;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class VectorComputeApplication {

    public static void main(String[] args) {

        SpringApplication.run(VectorComputeApplication.class, args);
    }
    @GetMapping("/vector")
    public String vector(@RequestParam(value="x1", defaultValue="0")String x1,
                         @RequestParam(value="x2", defaultValue="0")String x2,
                         @RequestParam(value="y1", defaultValue="0")String y1,
                         @RequestParam(value="y2", defaultValue="0")String y2)

    {
        int _x1 = Integer.parseInt(x1);
        int _x2 = Integer.parseInt(x2);
        int _y1 = Integer.parseInt(y1);
        int _y2 = Integer.parseInt(y2);

        return String.format("Len=%s Px=%s Py=%s",
                (Math.sqrt(
                        (_x2 - _x1) * (_x2 - _x1) +
                        (_y2 - _y1) * (_y2 - _y1))
                ),
                Math.abs(_x2 - _x1),
                Math.abs(_y2 - _y1));
    }


}

