package im.zhaojun.mapper;

import im.zhaojun.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> selectAll();

    List<Menu> selectAllMenu();

    int deleteByParentId(Integer parentId);

    List<Integer> selectChildrenID(Integer id);

    List<Menu> selectMenuByUserName(@Param("userName") String userName);
}