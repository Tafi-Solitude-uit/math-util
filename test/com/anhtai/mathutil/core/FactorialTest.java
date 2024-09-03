package com.anhtai.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


public class FactorialTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell()
    {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0)); 
    }
    
    //check xem cos ngoaị lệ khi đưa data không thỏa 
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException()
    {
        MathUtil.getFactorial(-5);
    }
    
}
//quy ước xanh đỏ:
//1. xanh, tất cả tình huống xài hàm cùng xanh
//2. Đỏ, chỉ cần 1 tình huống sai thì cả hàm bị đỏ
//Đỏ: 
//Hoặc bạn tính toán trong thuật toán/hàm sai
//Hoặc bạn kì vọng sai

