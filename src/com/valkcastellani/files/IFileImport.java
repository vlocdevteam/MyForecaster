package com.valkcastellani.files;

import java.util.ArrayList;

public interface IFileImport {

    /**
     * @param fileName
     * @return List of class T
     */
    ArrayList<T> fileImport(String fileName);
}
