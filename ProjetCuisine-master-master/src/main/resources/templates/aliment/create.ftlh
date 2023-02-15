<#assign modalScript>
</#assign>
<@l.layout title="Aliment - Create" js=modalScript>
    <div class="row">
        <form method="post">
            <@m.matFormInput field="Nom" label="nom" errors=errors />
            <@m.matFormInput field="unité" label="unité" errors=errors />
            <@m.matSubmit />
        </form>

        <button id="modalActivate">CLICK ME</button>
    </div>
</@l.layout>