class InterpreterContext {
    // "<Number> in Binary" or "<Number> in Hexadecimal"
    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
