import org.cloudbus.cloudsim.Cloudlet;
import others.WorkloadFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(String[] args) throws FileNotFoundException {

        WorkloadFileReader fileReader = new WorkloadFileReader("src/HPC2N-2002-2.2-cln.swf",1);
        ArrayList<Cloudlet> jobs = fileReader.generateWorkload();

        for (Cloudlet item: jobs){
            System.out.println(item.toString());
        }
    }
}