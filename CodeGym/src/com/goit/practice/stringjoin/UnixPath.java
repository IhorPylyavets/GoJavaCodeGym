package com.goit.practice.stringjoin;

import java.util.ArrayList;
import java.util.List;

public class UnixPath {
    public String simplify(String input) {
        if (input.length() > 4096){
            return "/";
        }

        String[] pathArray = input.split("/");
        List<String> pathList = new ArrayList<>();

        for (int i = 0; i < pathArray.length; i++) {
            if (pathArray[i].equals("..")) {
                pathList.remove(pathList.size()-1);
                continue;
            }
            if (!(pathArray[i].equals("") || pathArray[i].equals("."))) {
                pathList.add(pathArray[i]);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (String pathElement : pathList) {
            stringBuilder.append("/");
            stringBuilder.append(pathElement);
        }

        if (pathList.size() == 0) {
            stringBuilder.append("/");
        }

        return stringBuilder.toString();
    }
}

