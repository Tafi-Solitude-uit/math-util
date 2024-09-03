package com.anhtai.mathutil.core;


import static com.anhtai.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //ta viết kĩ thuật mới, tách data ra hẳn các lệnh kiểm tra hàm
    //data này ta có thể đặt ở file .txt, .csv, .excel, database bên ngoài
    //input và output/expected là những cặp
    //nhiều cặp cần phải test, do đó data để test hàm sẽ là mảng 2 chiều 
    //mảng 2 chiều này sẽ được nạp từ .txt, db,...
    //hoặc ta sẽ tạo luôn 1 mảng 2 chiều ngày trong đây
    
    @Parameters
    public static Object[][] initData()
    {
        return new Integer[][] {
                            {0, 1},
                            {1, 1},
                            {2, 2},
                            {3, 6},
                            {4, 24},
                            {5, 120}
                                };
    }
//    @before
//    hàm tải load data vào ram
    
    //ta cần map 2 cột vào 2 biến để lát hồi nhồi/ feed chúng vào
    //hàm checkFactoral, ta gọi là testing kiểu tham số hóa
    //parameterized testing
    
    @Parameter(value = 0) //map cột 0 của data
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell()
    {
        assertEquals(expected, getFactorial(input));
    }
}
