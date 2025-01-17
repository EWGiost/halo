package run.halo.app.theme.finders.vo;

import java.util.List;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import lombok.With;
import run.halo.app.core.extension.Menu;
import run.halo.app.extension.MetadataOperator;

/**
 * A value object for {@link Menu}.
 *
 * @author guqing
 * @since 2.0.0
 */
@Value
@ToString
@Builder
public class MenuVo {

    MetadataOperator metadata;

    Menu.Spec spec;

    @With
    List<MenuItemVo> menuItems;

    /**
     * Convert {@link Menu} to {@link MenuVo}.
     *
     * @param menu menu extension
     * @return menu value object
     */
    public static MenuVo from(Menu menu) {
        return builder()
            .metadata(menu.getMetadata())
            .spec(menu.getSpec())
            .menuItems(List.of())
            .build();
    }
}
