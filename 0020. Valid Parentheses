class Solution {
    public boolean isValid(String s) {
        char[] arr= new char[s.length()];
        int a= -1;
        for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
         switch (c) {
          case '(':
          case '{':
          case '[':
            arr[++a] = c;
            break;
             case ')':
            if (a== -1 || arr[a--] != '(') return false;
            break;
            case '}':
            if (a== -1 || arr[a--] != '{') return false;
            break;
            case ']':
            if (a== -1 || arr[a--] != '[') return false;
            break;
    }
}
    return a== -1;
    }
}
