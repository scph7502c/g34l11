package task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EmployeeSalaryCalculatorTest {

    @Test
    public void testCalculateEmployeeSalary() {

        BasicSalaryService basicSalaryService = mock(BasicSalaryService.class);
        SaturdayBonusService saturdayBonusService = mock(SaturdayBonusService.class);

        when(basicSalaryService.getBasicSalary()).thenReturn(2000.0);
        when(saturdayBonusService.getSaturdayBonus()).thenReturn(100.0);

        EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator(basicSalaryService, saturdayBonusService);

        double result = calculator.calculateEmployeePayment(500.0, 4);

        assertEquals(2900.0, result);

        verify(basicSalaryService, times(1)).getBasicSalary();
        verify(saturdayBonusService, times(1)).getSaturdayBonus();
    }
}