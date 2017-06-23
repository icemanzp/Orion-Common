package com.jack.orion.adapter.infc;

import java.util.List;

/**
 * 数据存储接口
 * Created by Jack on 2017/6/23.
 */
public interface ResourceStore {

    /**
    * @Description:
    * <p> 存储资源数据 </p>
    *
    * @Methods Name createStore
    * @param name  存储的识别名称
    * @param data  存储的数据，Object 类型用于适配
    * @throws
    * @return 成功存储返回：True
    * @Create In 2017/6/23 By Jack
    **/
    public boolean createStore(String name, Object data);

    /**
    * @Description:
    * <p> 修改已存储的资源 </p>
    *
    * @Methods Name modifyData
    * @param  name 要修改的资源名称
    * @param newData 新的数据，Object 类型用于适配
    * @throws
    * @return  修改成功返回：True
    * @Create In 2017/6/23 By Jack
    **/
    public boolean modifyData(String name, Object newData);

    /**
    * @Description:
    * <p> 删除资源信息 </p>
    *
    * @Methods Name deleteData
    * @param name 待删除的资源名称
    * @throws
    * @return 删除成功返回：True
    * @Create In 2017/6/23 By Jack
    **/
    public boolean deleteData(String name);

    /**
    * @Description:
    * <p> 查询指定资源名称的数据 </p>
    *
    * @Methods Name findByName
    * @param  name 待查询资源的名称
    * @throws
    * @return 查询成功返回数据，否则返回 NULL
    * @Create In 2017/6/23 By Jack
    **/
    public Object findByName(String name);

    /**
    * @Description:
    * <p> 查询Root 内的所有数据 </p>
    *
    * @Methods Name
    * @throws
    * @return 成功返回全部数据 List
    * @Create In 2017/6/23 By Jack
    **/
    public List<Object> find();
}
