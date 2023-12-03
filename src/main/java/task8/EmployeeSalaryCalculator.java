package task8;

public class EmployeeSalaryCalculator {
    private final BasicSalaryService basicSalaryService;
    private final SaturdayBonusService saturdayBonusService;

    public EmployeeSalaryCalculator(BasicSalaryService basicSalaryService, SaturdayBonusService saturdayBonusService) {
        this.basicSalaryService = basicSalaryService;
        this.saturdayBonusService = saturdayBonusService;
    }

    public double calculateEmployeePayment(double oneTimeBonus, int numberOfSaturdays) {
        double basicSalary = basicSalaryService.getBasicSalary();
        double saturdayBonus = saturdayBonusService.getSaturdayBonus();

        return basicSalary + oneTimeBonus + (saturdayBonus * numberOfSaturdays);
    }
}