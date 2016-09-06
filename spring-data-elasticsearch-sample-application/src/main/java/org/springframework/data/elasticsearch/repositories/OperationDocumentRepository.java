package org.springframework.data.elasticsearch.repositories;

import org.springframework.data.elasticsearch.entities.OperationDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OperationDocumentRepository  extends ElasticsearchRepository<OperationDocument, Long> {

}
