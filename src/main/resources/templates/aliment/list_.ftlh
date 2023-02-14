<@l.layout title="aliment-list">
    <div class="row">
        <table>
            <thead>
            <tr>
                <th><@spring.message "Nom"/></th>
                <th><@spring.message "Unité" /></th>
            </tr>
            </thead>
            <tbody>
            <#list list as item>
                <tr>
                    <td>${item.nom}</td>
                    <td>${item.unité}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
    <a href="/aliment/create" class="btn"><@spring.message "add" /></a>
</@l.layout>