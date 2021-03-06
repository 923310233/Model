package ${entity.filePackage};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<#list entity.imports as import>
import ${import};
</#list>

/**
 * This code is generated by FreeMarker
 */

@Service
public class ${entity.entityName}ServiceImpl implements ${entity.entityName}Service{

    @Autowired
    private ${entity.entityName}Mapper mapper ;

    public void insert(${entity.entityName}PO ${entity.objectName}){
        mapper.insert(${entity.objectName});
    }

}
