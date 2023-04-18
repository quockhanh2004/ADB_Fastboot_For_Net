package adb_tool.folder;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class getDevices {

    public ArrayList<Devices> DevicesList(BufferedReader reader) throws IOException {
        ArrayList<Devices> ketqua = new ArrayList<>();
        String text;
        while ((text = reader.readLine()) != null) {
            Devices dv = new Devices();
            String[] abc = text.split("	");
            if (abc.length > 1) {
//                if (abc[1].equals("unauthorized")
//                        || abc[1].equals("device")
//                        || abc[1].equals("offline")
//                        || abc[1].equals("no permissions")
//                        || abc[1].equals("unknown")
//                        || abc[1].equals("recovery")
//                        || abc[1].equals("sideload")) 
//                {
                    dv.Name = (abc[0].trim());
                    dv.authorized = abc[1].trim();
                    ketqua.add(dv);
//                for (Devices ls : ketqua) {
//                    System.out.println(ls.Name + "\t" + ls.authorized);
//                }

//                }
            }
        }

        return ketqua;
    }
}
