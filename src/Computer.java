public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    Computer(Brand brand, Processor processor, Memory memory, Monitor monitor){
        this.brand=brand;
        this.processor=processor;
        this.memory=memory;
        this.monitor=monitor;
    }
    public Processor getProc(){
        return processor;
    }
    public Memory getmem(){
        return memory;
    }
    public Monitor getmon(){
        return monitor;
    }
    public Brand getBrand() {
        return brand;
    }

    public String getMemory() {
        return "Размер памяти = "+memory.getMem_size();
    }

    public String getMonitor() {
        return "Высота = "+monitor.getHeight()+", Ширина = "+monitor.getWidth();
    }
    public String getProcessor() {
        return "Производитель = "+processor.getManufacturer()+", Кол-во ядер = "+processor.getCores()+", Мощность процессора = "+processor.getPower_ghz();
    }

    @Override
    public String toString() {
        return "Бренд: "+getBrand()+", Память: "+getMemory()+", процессор: "+getProcessor()+", монитор: "+getMonitor();
    }
}
