/* SPDX-License-Identifier: Apache-2.0 */

package marquez.db.mappers;

import static marquez.db.Columns.stringOrNull;
import static marquez.db.Columns.stringOrThrow;
import static marquez.db.Columns.timestampOrThrow;
import static marquez.db.Columns.uuidOrThrow;

import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.NonNull;
import marquez.db.Columns;
import marquez.db.models.SourceRow;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

public final class SourceRowMapper implements RowMapper<SourceRow> {
  @Override
  public SourceRow map(@NonNull ResultSet results, @NonNull StatementContext context)
      throws SQLException {
    return new SourceRow(
        uuidOrThrow(results, Columns.ROW_UUID),
        stringOrThrow(results, Columns.TYPE),
        timestampOrThrow(results, Columns.CREATED_AT),
        timestampOrThrow(results, Columns.UPDATED_AT),
        stringOrThrow(results, Columns.NAME),
        stringOrThrow(results, Columns.CONNECTION_URL),
        stringOrNull(results, Columns.DESCRIPTION));
  }
}
