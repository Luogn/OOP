import java.util.ArrayList;
import java.util.List;

class week10 {
    public boolean checkValid(String[] words) {
        if(words[0].equals("public") || words[0].equals("private")
        || words[0].equals("protected") || words[0].equals("static")) {
            return true;
        }

        if (!words[0].equals("static") && !words[1].equals("static")) {
            
        }

        return true;
    }
    // private String getFunctionName(String line) {
    //     String rs = "";
    //     for (int i = 0; i < line.length(); i++) {
    //         if (line.charAt(i) != '(') {
    //             rs += line.charAt(i);
    //         } else {
    //             rs += "(" + getParam(line.substring(i + 1));
    //             break;
    //         }
    //     }
    //     return rs;
    // }

    public List<String> getAllFunctions(String fileContent) {
        List<String> results = new ArrayList<>();
        String[] lines = fileContent.split("\n");
        String res;
        for(String line : lines) {
            String[] words = line.split(" ");
            if(1 == 2) continue;

        }
        return res;
    }

    
}