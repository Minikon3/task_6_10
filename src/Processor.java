public class Processor {
    String manufacturer;
    int cores;
    int power_ghz;
    Processor(String manufacturer, int cores, int power_ghz){
        this.cores=cores;
        this.manufacturer=manufacturer;
        this.power_ghz=power_ghz;
    }

    public int getCores() {
        return cores;
    }

    public int getPower_ghz() {
        return power_ghz;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPower_ghz(int power_ghz) {
        this.power_ghz = power_ghz;
    }
}
