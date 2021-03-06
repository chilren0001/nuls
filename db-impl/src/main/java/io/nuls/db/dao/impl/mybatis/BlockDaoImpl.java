package io.nuls.db.dao.impl.mybatis;

import io.nuls.db.dao.BlockDao;
import io.nuls.db.dao.impl.mybatis.mapper.BlockMapper;
import io.nuls.db.dao.impl.mybatis.session.SessionAnnotation;
import io.nuls.db.entity.BlockPo;

import java.util.List;

/**
 * Created by zhouwei on 2017/9/29.
 */
public class BlockDaoImpl extends BaseDaoImpl implements BlockDao {

    private BlockMapper blockMapper;

    @Override
    @SessionAnnotation
    public int save(BlockPo blockPo) {
        blockMapper = getMapper(BlockMapper.class);
        return blockMapper.insert(blockPo);
    }

    @Override
    public int saveBatch(List<BlockPo> list) {
        return 0;
    }

    @Override
    @SessionAnnotation
    public int update(BlockPo blockPo) {
        blockMapper = getMapper(BlockMapper.class);
        return blockMapper.updateByPrimaryKey(blockPo);
    }

    @Override
    public int updateSelective(BlockPo blockPo) {
        return 0;
    }

    @Override
    public BlockPo getByKey(String key) {
        blockMapper = getMapper(BlockMapper.class);
        return blockMapper.selectByPrimaryKey(key);
    }

    @Override
    public int deleteByKey(String s) {
        return 0;
    }

    @Override
    public List<BlockPo> getList(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Long getCount() {
        return null;
    }

}
