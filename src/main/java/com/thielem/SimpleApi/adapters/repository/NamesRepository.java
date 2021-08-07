package com.thielem.SimpleApi.adapters.repository;

import com.thielem.SimpleApi.adapters.repository.entities.Names;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface NamesRepository extends CassandraRepository<Names, UUID> {
}
