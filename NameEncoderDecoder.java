public class NameEncoderDecoder {
    public String encode(String name) {
        String first ="NOTFORYOU";
        String end ="YESNOTFORYOU";
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'e':
                    arr[i] = '1';
                    break;
                case 'u':
                    arr[i] = '2';
                    break;
                case 'i':
                    arr[i] = '3';
                    break;
                case 'o':
                    arr[i] = '4';
                    break;
                case 'a':
                    arr[i] = '5';
                    break;
            }
        }
        String newName = new String(arr);
        return first+newName+end;
    }

    public String decode(String name){
        name = name.replace("NOTFORYOU", "");
        name = name.replace("YES", "");
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case '1':
                    arr[i] = 'e';
                    break;
                case '2':
                    arr[i] = 'u';
                    break;
                case '3':
                    arr[i] = 'i';
                    break;
                case '4':
                    arr[i] = 'o';
                    break;
                case '5':
                    arr[i] = 'a';
                    break;
            }
        }
        String newName = new String(arr);
        return newName;
    }

}
