package com.damai.service.tool;

import com.damai.vo.SeatVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 座位自动匹配
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class SeatMatch {
    
    public static List<SeatVo> findAdjacentSeatVos(List<SeatVo> allSeats, int seatCount) {
        List<SeatVo> adjacentSeats = new ArrayList<>();
        
        allSeats.sort((s1, s2) -> {
            if (Objects.equals(s1.getRowCode(), s2.getRowCode())) {
                return s1.getColCode() - s2.getColCode();
            } else {
                return s1.getRowCode() - s2.getRowCode();
            }
        });
        
        for (int i = 0; i < allSeats.size() - seatCount + 1; i++) {
            boolean seatsFound = true;
            for (int j = 0; j < seatCount - 1; j++) {
                SeatVo current = allSeats.get(i + j);
                SeatVo next = allSeats.get(i + j + 1);
                
                if (!(Objects.equals(current.getRowCode(), next.getRowCode()) && 
                        next.getColCode() - current.getColCode() == 1)) {
                    seatsFound = false;
                    break;
                }
            }
            if (seatsFound) {
                for (int k = 0; k < seatCount; k++) {
                    adjacentSeats.add(allSeats.get(i + k));
                }
                return adjacentSeats;
            }
        }
        return adjacentSeats;
    }
}
