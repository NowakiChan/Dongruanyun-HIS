package com.neuedu.his.service;

import com.neuedu.his.entity.Drug;
import com.neuedu.his.entity.PrescriptionItem;
import com.neuedu.his.repository.DrugRepository;
import com.neuedu.his.repository.PrescriptionItemRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RefundService {

    @Resource
    private PrescriptionItemRepository itemRepository;

    @Resource
    private DrugRepository drugRepository;

    // 获取所有已发药但未退药的处方项
    public List<PrescriptionItem> getRefundableItems() {
        return itemRepository.findByState("已发药");
    }

    // 执行退药
    public boolean refundDrug(Long itemId, String operator) {
        Optional<PrescriptionItem> optionalItem = itemRepository.findById(itemId);
        if (optionalItem.isPresent()) {
            PrescriptionItem item = optionalItem.get();
            Drug drug = item.getDrug();

            // 修改状态
            item.setState("已退药");

            // 保存
            drugRepository.save(drug);
            itemRepository.save(item);
            return true;
        }
        return false;
    }
}