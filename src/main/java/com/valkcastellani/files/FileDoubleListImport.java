package com.valkcastellani.files;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import com.valkcastellani.files.IFileImport;

public class FileDoubleListImport implements IFileImport {
    
    /**
     * @param fileName
     * @return
     */
    @Override
    public ArrayList<Double> fileImport(String fileName) {
        ArrayList<Double> list = new ArrayList<>();

        List<String> listContent =  FileUtils.readLines(fileName, "UTF-8");

        listContent.forEach(item -> {
            if (StringUtils.isNumeric(item.trim())) {
                list.add(Double.valueOf(item.trim()));            
            } else {
                list.add(Double.NaN);
            }
        });

        return list;
    }
}
