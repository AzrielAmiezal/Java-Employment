public class Employment {

    //Declare variables
    private String empName;
    private int empAge;
    private String empSex;
    private String empMarital;
    private String empJobClass;
    private int empHealth;
    private double empWage;

    //constructor with parameter
    public Employment(String empName, int empAge, String empSex, String empMarital, String empJobClass, int empHealth, double empWage) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSex = empSex;
        this.empMarital = empMarital;
        this.empJobClass = empJobClass;
        this.empHealth = empHealth;
        this.empWage = empWage;
    }

    //Accessor methods
    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpSex() {
        return empSex;
    }

    public String getEmpMarital() {
        return empMarital;
    }

    public String getEmpJobClass() {
        return empJobClass;
    }

    public int getEmpHealth() {
        return empHealth;
    }

    public double getEmpWage() {
        return empWage;
    }

    //Mutator methods
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public void setEmpMarital(String empMarital) {
        this.empMarital = empMarital;
    }

    public void setEmpJobClass(String empJobClass) {
        this.empJobClass = empJobClass;
    }

    public void setEmpHealth(int empHealth) {
        this.empHealth = empHealth;
    }

    public void setEmpWage(double empWage) {
        this.empWage = empWage;
    }

    //toString method

    @Override
    public String toString() {
        return "Employment{" +
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empSex='" + empSex + '\'' +
                ", empMarital='" + empMarital + '\'' +
                ", empJobClass='" + empJobClass + '\'' +
                ", empHealth=" + empHealth +
                ", empWage=" + empWage +
                '}';
    }
}
