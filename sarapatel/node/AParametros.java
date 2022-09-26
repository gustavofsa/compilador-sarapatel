/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class AParametros extends PParametros
{
    private PSeparadorParametroVazio _separadorParametroVazio_;

    public AParametros()
    {
        // Constructor
    }

    public AParametros(
        @SuppressWarnings("hiding") PSeparadorParametroVazio _separadorParametroVazio_)
    {
        // Constructor
        setSeparadorParametroVazio(_separadorParametroVazio_);

    }

    @Override
    public Object clone()
    {
        return new AParametros(
            cloneNode(this._separadorParametroVazio_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametros(this);
    }

    public PSeparadorParametroVazio getSeparadorParametroVazio()
    {
        return this._separadorParametroVazio_;
    }

    public void setSeparadorParametroVazio(PSeparadorParametroVazio node)
    {
        if(this._separadorParametroVazio_ != null)
        {
            this._separadorParametroVazio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._separadorParametroVazio_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._separadorParametroVazio_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._separadorParametroVazio_ == child)
        {
            this._separadorParametroVazio_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._separadorParametroVazio_ == oldChild)
        {
            setSeparadorParametroVazio((PSeparadorParametroVazio) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}