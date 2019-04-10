package com.integration.config.entity_name;
import org.hibernate.HibernateException;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.ImplicitEntityNameSource;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.spi.MetadataBuildingContext;

import java.util.Locale;

import static org.atteo.evo.inflector.English.plural;


public class PluralEntity extends ImplicitNamingStrategyJpaCompliantImpl {

  @Override
  protected Identifier toIdentifier(String stringForm, MetadataBuildingContext buildingContext) {
    return super.toIdentifier(addUnderscores(stringForm), buildingContext);
  }

  @Override
  public Identifier determinePrimaryTableName(ImplicitEntityNameSource source) {
    if (source == null) {
      throw new HibernateException("Entity naming information was not provided.");
    } else {
      String tableName = this.transformEntityName(source.getEntityNaming());
      if (tableName == null) {
        throw new HibernateException("Could not determine primary table name for entity");
      } else {
        return this.toIdentifier(plural(tableName), source.getBuildingContext());
      }
    }
  }


  protected static String addUnderscores(String name) {
    final StringBuilder buf = new StringBuilder(name.replace('.', '_'));
    for (int i = 1; i < buf.length() - 1; i++) {
      if (Character.isLowerCase(buf.charAt(i - 1))
        && Character.isUpperCase(buf.charAt(i))
        && Character.isLowerCase(buf.charAt(i + 1))) {
        buf.insert(i++, '_');
      }
    }

    return buf.toString().toLowerCase(Locale.ROOT);
  }

}
