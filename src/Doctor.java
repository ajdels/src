public class Doctor {
    protected String AlmaMater;
    private double fee;

    public Doctor(String MedSchool, double fee) {
        AlmaMater = MedSchool;
        this.fee = fee;
    }

    public void treatPatient(Person patient) {
        System.out.println("The Doctor says take two of these and call the office in the morning.");
        patient.getTreated();

    }

    public double billPatient(Person patient) {
        patient.payBill(fee);
        return fee;
    }

    public double billPatient(boolean isMedicare, GovernmentProgram) {
        if (isMedicare)
            return fee / 2;
        return fee;
    }
    @Override
    public String toString(){
        return "Doctor: \nMed School:"+ AlmaMater+"\nFee:"+fee;
    }
}
