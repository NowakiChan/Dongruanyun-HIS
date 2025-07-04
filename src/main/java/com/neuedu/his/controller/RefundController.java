package com.neuedu.his.controller;

import com.neuedu.his.entity.PrescriptionItem;
import com.neuedu.his.service.RefundService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "门诊退药管理")
@RestController
@RequestMapping("/api/refund")
public class RefundController {

    @Resource
    private RefundService refundService;

    @Operation(summary = "获取所有可退药的记录")
    @GetMapping("/eligible")
    public List<PrescriptionItem> getRefundableItems() {
        return refundService.getRefundableItems();
    }

    @Operation(summary = "执行退药")
    @PostMapping("/{itemId}")
    public String refund(@PathVariable Long itemId, @RequestParam String operator) {
        boolean success = refundService.refundDrug(itemId, operator);
        return success ? "退药成功" : "退药失败：ID 无效或状态错误";
    }
}
