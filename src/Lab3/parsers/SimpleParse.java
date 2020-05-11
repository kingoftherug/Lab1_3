package Lab3.parsers;
public class SimpleParse extends ComLineParserBase {

    //конструкторы саб-класса
    public SimpleParse() {
        super(new String[]{"?","r","w"});
    }

    //параметры и их сеттеры и геттеры
    private String inFile;
    private String outFile;

    public void setInFile(String inFile) {
        this.inFile = inFile;
    }
    public String getInFile() {
        return inFile;
    }
    public void setOutFile(String outFile) {
        this.outFile = outFile;
    }
    public String getOutFile() {
        return outFile;
    }

    //переопределение метода базового класса
    @Override
    protected void OnUsage(String errorKey){
        if (errorKey != null)
            System.out.println("Command-line switch error:" + errorKey);

        System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
	System.out.println("   -?  показать Help файл");
	System.out.println("   -r  задать имя входного файла");
	System.out.println("   -w  выполнить вывод в указанный файл");
    }

    @Override
    protected SwitchStatus OnSwitch (String key, String keyValue) {
        SwitchStatus status = SwitchStatus.NoError;
        switch (key) {
            case "?": status = SwitchStatus.ShowUsage;
            break;
            case "r":
                if (keyValue != null) { inFile = keyValue; }
                else { System.out.println("Пустое значение по ключу: " + key);status = SwitchStatus.Error;};
                break;

            case "w":
                if (keyValue != null) {inFile = keyValue; }
                else { System.out.println("Пустое значение по ключу: " + key);status = SwitchStatus.Error;};
                break;
            default:
                System.out.println("Ключ " + key + " не найден.");
                status = SwitchStatus.Error;
                break;
        }
        return status ;
    }
}
