/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.connector.pulsar.source;

import org.apache.flink.api.connector.source.SplitEnumeratorContext;
import org.apache.flink.connector.pulsar.source.split.PulsarPartitionSplit;

import org.apache.pulsar.client.admin.PulsarAdmin;
import org.apache.pulsar.client.admin.PulsarAdminException;
import org.apache.pulsar.client.api.Range;

import java.io.Serializable;
import java.util.Collection;

/**
 * Split strategy for Topic range.
 */
public interface SplitDivisionStrategy extends Serializable {
    Collection<Range> getRanges(String topic, PulsarAdmin pulsarAdmin, SplitEnumeratorContext<PulsarPartitionSplit> context) throws PulsarAdminException;
}

