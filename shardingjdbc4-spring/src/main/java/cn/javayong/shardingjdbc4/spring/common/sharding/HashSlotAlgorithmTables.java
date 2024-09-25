package cn.javayong.shardingjdbc4.spring.common.sharding;

import cn.javayong.shardingbase.ShardingConstants;
import cn.javayong.shardingbase.SnowFlakeIdGenerator;
import cn.javayong.shardingbase.StringHashUtil;
import com.alibaba.druid.support.json.JSONUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springfox.documentation.spring.web.json.Json;

import java.util.*;

/**
 * 分表策略
 * HashSlotAlgorithm 32 表
 */
public class HashSlotAlgorithmTables extends HashSlotAlgorithmDatabase{

    ConsistentHashingTables consistentHashingTables = new ConsistentHashingTables();

    /**
     * 分片策略
     *
     * @param availableTargetNames available data sources or tables's names 发挥的是多少个库，t_ent_order_detail0-31
     * @param complexKeysShardingValue {@link ComplexKeysShardingValue} ex: ComplexKeysShardingValue(logicTableName=t_ent_order, columnNameAndShardingValuesMap={id=[674988670850883591]}, columnNameAndRangeValuesMap={})
     * @return
     */
    @Override
    public Collection<String> doSharding(Collection availableTargetNames, ComplexKeysShardingValue complexKeysShardingValue) {
        consistentHashingTables.init(new ArrayList<>(availableTargetNames), 1);
        return getSharding(availableTargetNames, complexKeysShardingValue, consistentHashingTables);
    }

}
