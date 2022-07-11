import org.cloudbus.cloudsim.Cloudlet;
import others.WorkloadFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        WorkloadFileReader fileReader = new WorkloadFileReader("src/fs4F1R3Res30.txt",1);
        ArrayList<Cloudlet> jobs = fileReader.generateWorkload();

    }
}