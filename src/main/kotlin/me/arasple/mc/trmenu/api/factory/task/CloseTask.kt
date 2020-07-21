package me.arasple.mc.trmenu.api.factory.task

import me.arasple.mc.trmenu.api.factory.MenuFactory
import org.bukkit.entity.Player

/**
 * @author Arasple
 * @date 2020/7/20 20:21
 */
fun interface CloseTask {

    fun run(player: Player, factory: MenuFactory)

}