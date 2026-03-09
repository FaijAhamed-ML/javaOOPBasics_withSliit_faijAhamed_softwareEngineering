package que3;

public class Employee {
    private int employeeid;
    private String employeeName;
    private double basicSalary;
    private int perRating;

    public void setEmployeeid(int employeeid){
        this.employeeid=employeeid;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public void setBasicSalary(double basicSalary){
        this.basicSalary=basicSalary;
    }
    public void setPerRating(int perRating){
        this.perRating=perRating;
    }
    public int getEmployeeid(){
        return employeeid;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public double getBasicSalary(){
        return  basicSalary;
    }
    public int getPerRating(){
        return perRating;
    }
    public double calculateBonus(){
        double percentage=0.0;
        switch (perRating){
            case 1:
                percentage=0.0;
                break;
            case 2 :
                percentage=5.0;
                break;
            case 3 :
                percentage=10.0;
                break;
            case 4 :
                percentage=15.0;
                break;
            case 5 :
                percentage=20.0;
                break;
            default:
                System.out.println("Enter the correct input !!!");
        }
        return basicSalary*(100.0+percentage)/100;
    }
    public double calculateTotalSalary(){
        return basicSalary+ calculateBonus();
    }

}
