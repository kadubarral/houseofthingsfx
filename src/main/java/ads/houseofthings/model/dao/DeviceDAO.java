package ads.houseofthings.model.dao;

import ads.houseofthings.model.domain.Device;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DeviceDAO {

    private static final String JSON_URL = "http://localhost:8080/devices";

    public List<Device> listDevice() {
        List<Device> deviceList = new ArrayList<>();
        try {
            Gson gson = new Gson();
            deviceList = new Gson().fromJson(readUrl(JSON_URL), new TypeToken<List<Device>>() {
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deviceList;
    }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}