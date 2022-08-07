package utility;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FindPath {

    // * find app path
    public static String returnAppPath(){
        String path;
        Path resourceDirectory = Paths.get("src","test","resources","apps","ContactManager.apk");
        path = resourceDirectory.toFile().getAbsolutePath();
        return path;
    }

}
