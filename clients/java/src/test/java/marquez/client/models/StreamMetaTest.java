/* SPDX-License-Identifier: Apache-2.0 */

package marquez.client.models;

import static marquez.client.models.ModelGenerator.newStreamMeta;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

@org.junit.jupiter.api.Tag("UnitTests")
public class StreamMetaTest {
  private static final DatasetMeta META = newStreamMeta();
  private static final String JSON = JsonGenerator.newJsonFor(META);

  @Test
  public void testToJson() {
    final String actual = META.toJson();
    assertThat(actual).isEqualTo(JSON);
  }
}
