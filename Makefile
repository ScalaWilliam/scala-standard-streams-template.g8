test:
	@rm -rf streaming-word-count
	sbt new file://$${PWD} \
			--name="Streaming Word Count" \
			--organization=com.scalawilliam \
			--package=com.scalawilliam.stream.wordcount \
			--className=StreamingWordCountApp \
			--docker_repository=scalawilliam \
			--project_name=streaming-word-count
	cd streaming-word-count && sbt test stage

.PHONY: test
