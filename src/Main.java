import java.util.Scanner;

public class Main {
    static void addComputer(Brand brand,Processor processor,Memory memory,Monitor monitor,Computer[] computers){
        for (int whl=0;whl< computers.length;whl++){
            if (computers[whl]==null){
                computers[whl]=new Computer(brand,processor,memory,monitor);
                break;
            }
        }
    }
    static void deleteComputer(Brand brand,Processor processor,Memory memory,Monitor monitor,Computer[] computers){
        for (int j=0;j< computers.length;j++){
            if (computers[j]==null){
                break;
            }
            if (computers[j].getBrand()==brand && computers[j].getProc().getManufacturer()== processor.getManufacturer() && computers[j].getProc().getCores()== processor.getCores() && computers[j].getProc().getPower_ghz()== processor.getPower_ghz() && computers[j].getmon()==monitor){
                delElArray(j,computers);
            }
        }
    }
    static void delElArray(int elementtodelete, Computer[] computers){
        for (int k=0;k<computers.length;k++){
            if (k==elementtodelete){
                Computer[] newcomputers=new Computer[computers.length-1];
                for (int ind=0; ind<k;ind++){
                    newcomputers[ind]=computers[ind];
                }
                for (int ind2=k;ind2< computers.length-1;ind2++){
                    newcomputers[ind2]=computers[ind2+1];
                }
                computers=newcomputers;
                break;
            }
        }
    }
    public static void main(String[] args) {
        Computer[] computers = new Computer[10];
        computers[0]=new Computer(Brand.HP,new Processor("Intel",8,3),new Memory(8000),new Monitor(1920,1080));
        computers[1]=new Computer(Brand.ASUS,new Processor("AMD",6,4),new Memory(16000),new Monitor(2560,1440));
        computers[2]=new Computer(Brand.LENOVO,new Processor("Intel",12,4),new Memory(32000),new Monitor(3840,2160));
        computers[3]=new Computer(Brand.DELL,new Processor("AMD",2,2),new Memory(2000),new Monitor(1024,768));
        addComputer(Brand.HP,new Processor("Intel",4,3),new Memory(12000),new Monitor(1920,1080),computers);
        deleteComputer(Brand.ASUS,new Processor("AMD",6,4),new Memory(16000),new Monitor(2560,1440),computers);
        for (int i=0;i< computers.length;i++){
            if (computers[i]==null) {break;}
            System.out.println(computers[i]);
        }
    }
}