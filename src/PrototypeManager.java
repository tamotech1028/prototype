import java.util.HashMap;
import java.util.Map;

// 漫画の原本を保管するマネージャー
public class PrototypeManager {
    private final Map<String, Cloneable> prototypeMap;

    public PrototypeManager() {
        this.prototypeMap = new HashMap<>();
    }

    // 漫画をkeyで保管する
    public void addPrototype(String key, Cloneable protoType) {
        this.prototypeMap.put(key,protoType);
    }

    // keyを元に漫画のコピーを返却する
    public Cloneable getClone(String key) {
        return prototypeMap.get(key).createClone();
    }
}

