import java.util.HashMap;
import java.util.Map;

/**
 * Actual "behind-the-scenes" java to swift converter that processes
 * the parse tree for the java file and gives back swift code
 * @author Eyob Tsegaye
 */
public class J2SwiftListener extends Java8BaseListener {

    private static Map<String, String> typeMap = new HashMap<>();

    static {
        typeMap.put("boolean", "Bool");
        typeMap.put("Boolean", "Bool");
        typeMap.put("byte", "Int8");
        typeMap.put("Byte", "Int8");
        typeMap.put("short", "Int16");
        typeMap.put("Short", "Int16");
        typeMap.put("int", "Int32");
        typeMap.put("Integer", "Int32");
        typeMap.put("long", "Int64");
        typeMap.put("Long", "Int64");
        typeMap.put("float", "Float");
        typeMap.put("Float", "Float");
        typeMap.put("double", "Double");
        typeMap.put("Double", "Double");
        typeMap.put("char", "Character");
        typeMap.put("Character", "Character");
        typeMap.put("String", "String");
    }

    private StringBuilder code = new StringBuilder();

    /**
     * Returns the swift code to be outputted to a file, or the empty string if
     * the tree hasn't been walked with this listener.
     * @return swift code as a giant String
     */
    public String swiftCode() {
        return code.length() == 0 ? code.toString() :  code.insert(0, "import Foundation\n\n").toString();
    }

}
