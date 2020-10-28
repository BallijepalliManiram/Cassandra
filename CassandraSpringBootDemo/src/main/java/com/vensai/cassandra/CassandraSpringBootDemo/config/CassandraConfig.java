package com.vensai.cassandra.CassandraSpringBootDemo.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration 
@EnableCassandraRepositories(basePackages = "com.vensai.cassandra.CassandraSpringBootDemo.repository")
public class CassandraConfig extends AbstractCassandraConfiguration
{

	public static final String KEYSPACE = "springboot_keyspace";

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(KEYSPACE);

        return Arrays.asList(specification);
    }

    @Override
    protected List<DropKeyspaceSpecification> getKeyspaceDrops() {
        return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
    }

    @Override
    protected String getKeyspaceName() {
        return KEYSPACE;
    }
    
    @Override
    protected String getLocalDataCenter() {
    	return "datacenter1";
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"guru.springframework.domain"};
    }
}
