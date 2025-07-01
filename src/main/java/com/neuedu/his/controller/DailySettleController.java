package com.neuedu.his.controller;

import com.neuedu.his.entity.DailySettle;
import com.neuedu.his.service.DailySettleService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/daily-settle")
public class DailySettleController {

    private final DailySettleService service;

    public DailySettleController(DailySettleService service) {
        this.service = service;
    }

    @GetMapping("/cashier/{cashierId}")
    public List<DailySettle> getSettleByCashierAndDate(
            @PathVariable Integer cashierId,
            @RequestParam String date) {
        return service.getByCashierAndDate(cashierId, LocalDate.parse(date));
    }

    @GetMapping
    public List<DailySettle> getAll() {
        return service.getAll();
    }

    @PostMapping
    public DailySettle saveSettle(@RequestBody DailySettle settle) {
        return service.save(settle);
    }
}
