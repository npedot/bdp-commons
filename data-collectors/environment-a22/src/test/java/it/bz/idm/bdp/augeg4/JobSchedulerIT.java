package it.bz.idm.bdp.augeg4;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Requires real Data Hub AND mqtt broker.
 */
@ContextConfiguration(locations = {"classpath:/META-INF/spring/applicationContext.xml"})
public class JobSchedulerIT extends AbstractJUnit4SpringContextTests {

    @Autowired
    private JobScheduler scheduler;


    @Test
    public void test_scheduled_sync_DataTypes_at_deploy() throws Exception {
        scheduler.pushDataTypes();
    }


    @Test
    public void test_scheduled_sync_stations() throws Exception {
        scheduler.pushStations();
    }


    @Test
    public void test_scheduled_push_data() throws Exception {
        scheduler.pushData();
    }

}