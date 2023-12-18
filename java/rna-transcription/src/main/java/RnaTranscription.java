import java.util.Objects;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String ans = "";
        if(Objects.equals(dnaStrand, "")) return "";
        for(int i = 0;i<dnaStrand.length();i++) {
            switch (dnaStrand.charAt(i)) {
                case 'A':
                    ans+= "U";
                    break;
                case 'T':
                    ans+= "A";
                    break;
                case 'G':
                    ans+="C";
                    break;
                case 'C':
                    ans+= "G";
                    break;

            }
        }
        return ans;
    }

}
