package com.vensai.cassandra.CassandraDemo;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.oss.driver.api.core.CqlSession;
import com.vensai.cassandra.CassandraDemo.connector.CassandraConnector;
import com.vensai.cassandra.CassandraDemo.domain.Video;
import com.vensai.cassandra.CassandraDemo.repository.KeySpaceRepository;
import com.vensai.cassandra.CassandraDemo.repository.VideoRepository;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		new App().run();
	}

	public void run() {
		CassandraConnector connector = new CassandraConnector();
		connector.connect("127.0.0.1", 9042, "datacenter1");
		CqlSession session = connector.getSession();

		KeySpaceRepository keyspaceRepository = new KeySpaceRepository(session);

		keyspaceRepository.createKeyspace("testKeyspace", 1);
		keyspaceRepository.useKeyspace("testKeyspace");

		VideoRepository videoRepository = new VideoRepository(session);

		videoRepository.createTable();

		videoRepository.insertVideo(new Video("Video Title 1", Instant.now()));
		videoRepository.insertVideo(new Video("Video Title 2", Instant.now().minus(1, ChronoUnit.DAYS)));

		List<Video> videos = videoRepository.selectAll();

		videos.forEach(x -> LOG.info(x.toString()));

		connector.close();
	}
}
