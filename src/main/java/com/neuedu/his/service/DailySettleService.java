package com.neuedu.his.service;

import com.neuedu.his.entity.DailySettle;
import com.neuedu.his.repository.DailySettleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DailySettleService {

    private final DailySettleRepository repository;

    public DailySettleService(DailySettleRepository repository) {
        this.repository = repository;
    }

    public List<DailySettle> getByCashierAndDate(Integer cashierId, LocalDate date) {
        return repository.findByCashierIdAndSettleDate(cashierId, date);
    }

    public DailySettle save(DailySettle settle) {
        return repository.save(settle);
    }

    public List<DailySettle> getAll() {
        return repository.findAll();
    }
}
