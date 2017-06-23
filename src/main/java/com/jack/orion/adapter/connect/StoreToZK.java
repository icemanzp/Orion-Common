package com.jack.orion.adapter.connect;

import com.jack.orion.adapter.infc.ResourceStore;
import com.jack.orion.config.Config;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 存储资源数据到 ZK
 * Created by Jack on 2017/6/23.
 */
@Service
public class StoreToZK implements ResourceStore {

    @Config("orion.resource.base.root")
    private String root;

    public boolean createStore(String name, Object data) {
        return false;
    }

    public boolean modifyData(String name, Object newData) {
        return false;
    }

    public boolean deleteData(String name) {
        return false;
    }

    public Object findByName(String name) {
        return null;
    }

    public List<Object> find() {
        return null;
    }
}
